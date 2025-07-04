package com.vishnu.service;
import com.vishnu.model.*;
import java.util.*;

public interface DegreeService {
    List<Degree> getAllDegrees();
    Degree getDegreeById(long id);
    Degree createDegree(Degree degree);
    void deleteDegree(long id);
}
