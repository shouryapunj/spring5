package pack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class Controller {

//    @Autowired
//    private App x;
    @Autowired
    Services service;

    @RequestMapping(
            value = "/IFSC",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )

//    ResponseEntity<HTMLOUt> calcInp(@RequestParam String inputIFSC)
    ResponseEntity<List<Bdata>> calcInp(@RequestParam String ifsc) {
        List<Bdata> data = service.getAll(ifsc);

        return ResponseEntity.ok(data);
    }
}