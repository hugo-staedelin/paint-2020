package fr.hstaedelin.paint.web.controller;

import fr.hstaedelin.paint.dao.CanvasDao;
import fr.hstaedelin.paint.exceptions.CanvasNullException;
import fr.hstaedelin.paint.models.CanvasModel;
import fr.hstaedelin.paint.polygons.Canvas;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Api(description = "API for the CRUD operations on the canvas.")
@RequestMapping(path = "Canvas")
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CanvasController {
//    @Autowired
//    private CanvasDao canvasDao;
//
//    @ApiOperation("Get all existing canvas")
//    @GetMapping(value = "")
//    public List<Canvas> searchAllCanvas(){
//        return canvasDao.findAll();
//    }
//
//
//    @ApiOperation("Get a specifing canvas with an ID if exist")
//    @GetMapping(value = "/{id}")
//    public ResponseEntity getACanvasById(@PathVariable int id){
//        Optional<Canvas> compositionById = canvasDao.findById(id);
//        return new ResponseEntity(compositionById.orElse(null), HttpStatus.FOUND);
//    }
//
//    @ApiOperation("Add a new canvas")
//    @PostMapping(value = "/add")
//    public ResponseEntity addComposition(@RequestBody CanvasModel cDB) throws CanvasNullException {
//        Canvas c = canvasDao.save(new Canvas(cDB));
//        if(c == null){
//            throw new CanvasNullException("Echec de la création du canvas.");
//        }
//        return new ResponseEntity(c, HttpStatus.CREATED);
//    }
//
//    @ApiOperation(value = "Remove the specific canvas with an ID in the H2DB.")
//    @DeleteMapping(value = "/{id}")
//    public ResponseEntity removeById(@PathVariable int id){
//        canvasDao.deleteById(id);
//        return new ResponseEntity(HttpStatus.ACCEPTED);
//    }
//
//    @ApiOperation(value = "Remove all the canvas in the H2DB.")
//    @DeleteMapping(value = "")
//    public ResponseEntity removeAll(){
//        canvasDao.deleteAll();
//        return new ResponseEntity(HttpStatus.ACCEPTED);
//    }
}