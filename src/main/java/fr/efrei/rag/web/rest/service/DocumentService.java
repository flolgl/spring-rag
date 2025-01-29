package fr.efrei.rag.web.rest.service;

import fr.efrei.rag.web.rest.domain.Document;
import fr.efrei.rag.web.rest.repository.DocumentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DocumentService {

    private final DocumentRepository documentRepository;

    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }


    public Document buildAndSave(Document document) {
        return documentRepository.save(document);
    }
    public Optional<Document> findById(Long id) {
        return Optional.ofNullable(documentRepository.getById(id));
    }

    public void deleteById(Long id) {
        documentRepository.deleteById(id);
    }

    public List<Document> findAll() {
        return documentRepository.findAll();
    }

}
