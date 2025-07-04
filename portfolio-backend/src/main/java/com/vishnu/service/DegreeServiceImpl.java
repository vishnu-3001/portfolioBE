package com.vishnu.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishnu.model.*;
import com.vishnu.repository.*;
import java.util.*;

@Service
public class DegreeServiceImpl implements DegreeService {
    @Autowired
    private DegreeRepository degreeRepository;

    @Override
    public List<Degree>getAllDegrees(){
        return degreeRepository.findAll();
    }

    @Override
    public Degree getDegreeById(long id){
        return degreeRepository.findById(id).orElse(null);
    }

    @Override
    public Degree createDegree(Degree degree){
        return degreeRepository.save(degree);
    }

    @Override
    public void deleteDegree(long id){
        degreeRepository.deleteById(id);
    }

}
