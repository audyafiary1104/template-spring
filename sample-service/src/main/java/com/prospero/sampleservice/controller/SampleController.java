package com.prospero.sampleservice.controller;
import com.prospero.sampleservice.service.Impl.SampleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/sample")
public class SampleController {

      @Autowired
      SampleServiceImpl sampleService;
      // Refer search criteria https://github.com/perplexhub/rsql-jpa-specification
      @GetMapping
      public void GetSample(@RequestParam(value = "search",required = false) String search ,
                            @RequestParam(value = "page",defaultValue = "0") int page,
                            @RequestParam(value = "size",defaultValue = "10") int size){

            sampleService.FetchData(search, PageRequest.of(page,size));
      }
}
