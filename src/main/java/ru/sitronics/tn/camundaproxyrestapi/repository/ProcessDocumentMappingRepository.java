package ru.sitronics.tn.camundaproxyrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.sitronics.tn.camundaproxyrestapi.model.ProcessDocumentMapping;

import java.util.Optional;

@Repository
public interface ProcessDocumentMappingRepository extends JpaRepository<ProcessDocumentMapping, Long> {
    Optional<ProcessDocumentMapping> findByDocumentType(String documentType);
}