package fr.hstaedelin.paint.web.controller;

import fr.hstaedelin.paint.dao.*;
import fr.hstaedelin.paint.exceptions.FormNullException;
import fr.hstaedelin.paint.models.*;
import fr.hstaedelin.paint.polygons.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Api(description = "API for the CRUD operations on the forms.")
@RequestMapping(path = "Form")
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FormController {
    @Autowired
    private FormDao formDao;

    @Autowired
    private CanvasDao canvasDao;

    @ApiOperation(value = "Search all specifics forms in the H2DB.")
    @GetMapping(value = "")
    public List<Form> showAllForms() throws FormNullException {
        return formDao.findAll();
    }

    @ApiOperation(value = "Search a specific form in the H2DB with an ID.")
    @GetMapping(value = "/{id}")
    public Optional<Form> findById(@PathVariable int id) throws FormNullException {
        Optional<Form> f = formDao.findById(id);
        if(f == null){
            throw new FormNullException("Forme numéro "+id+" non trouvée.");
        }
        return f;
    }

    @ApiOperation(value = "Search a specific collection of forms in the H2DB with an Canvas ID.")
    @GetMapping(value = "/Canvas/{id}")
    public ResponseEntity findFormByCanvasId(@PathVariable int id){
        List<Canvas> canvasList = canvasDao.findAll();
        canvasList.removeIf(s -> canvasList.get(id).getId() != id);
        return new ResponseEntity(canvasList, HttpStatus.OK);
    }

    @ApiOperation(value = "Add a new Rectangle in the H2DB.")
    @PostMapping(value="/rectangle")
    public ResponseEntity createRectangle(@RequestBody RectangleModel rectangle) throws IOException {
        Form addTriangle = formDao.save(new Rectangle(rectangle));
        if(addTriangle == null){
            return new ResponseEntity(null, HttpStatus.NOT_IMPLEMENTED);
        }
        return new ResponseEntity(addTriangle,HttpStatus.CREATED);
    }

    @ApiOperation(value = "Add a new Triangle in the H2DB.")
    @PostMapping(value="/triangle")
    public ResponseEntity createTriangle(@RequestBody TriangleModel triangle) throws IOException {
        Form addTriangle = formDao.save(new Triangle(triangle));
        if(addTriangle == null){
            return new ResponseEntity(null, HttpStatus.NOT_IMPLEMENTED);
        }
        return new ResponseEntity(addTriangle,HttpStatus.CREATED);
    }

    @ApiOperation(value = "Add a new Circle in the H2DB.")
    @PostMapping(value="/circle")
    public ResponseEntity createCircle(@RequestBody CircleModel circle) throws IOException {
        Form addCircle = formDao.save(new Circle(circle));
        if(addCircle == null){
            return new ResponseEntity(null, HttpStatus.NOT_IMPLEMENTED);
        }
        return new ResponseEntity(addCircle,HttpStatus.CREATED);
    }

//    @ApiOperation(value = "Update a specific form in the H2DB with an ID.")
//    @PutMapping (value = "/square/{id}")
//    public ResponseEntity updateSquare(@RequestBody SquareModel squareDB, @PathVariable int id){
//        formDao.deleteById(id);
//        Form f = formDao.save(new Square(squareDB, canvasDao.findById(squareDB.getCanvas()).orElse(null)));
//        if(f==null){
//            return new ResponseEntity(null, HttpStatus.NOT_MODIFIED);
//        }
//        return new ResponseEntity(f, HttpStatus.ACCEPTED);
//    }

    @ApiOperation(value = "Remove a specific form in the H2DB with an ID.")
    @DeleteMapping(value = "{id}")
    public ResponseEntity removeAForm(@PathVariable int id){
        if(formDao.findById(id) == null) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        else {
            formDao.deleteById(id);
            return new ResponseEntity(HttpStatus.ACCEPTED);
        }
    }

    @ApiOperation(value = "Remove all the forms in the H2DB.")
    @DeleteMapping(value = "")
    public ResponseEntity removeAll(){
        formDao.deleteAll();
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}