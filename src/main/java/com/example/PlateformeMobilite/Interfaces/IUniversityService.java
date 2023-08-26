package com.example.PlateformeMobilite.Interfaces;

import com.example.PlateformeMobilite.Entity.University;

import java.util.List;

public interface IUniversityService {
    public List<University> retrieveAllUniversities();
    public University retrieveUniversityById(Long UniversityId);
    public University addUniversity(University u);
    public University updateUniversity (Long id,University u);
    public void removeUniversity(Long UniversityId);
}
