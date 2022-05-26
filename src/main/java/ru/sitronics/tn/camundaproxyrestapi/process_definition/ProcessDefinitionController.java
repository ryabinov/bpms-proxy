package ru.sitronics.tn.camundaproxyrestapi.process_definition;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.sitronics.tn.camundaproxyrestapi.dto.ProcessInstanceDto;
import ru.sitronics.tn.camundaproxyrestapi.dto.StartProcessInstanceDto;

@RestController
@RequestMapping("/process-definition")
@RequiredArgsConstructor
public class ProcessDefinitionController {

    private final ProcessDefinitionService processDefinitionService;

    @PostMapping("/start-by-document-type")
    public ResponseEntity<ProcessInstanceDto> startProcessByDocumentType(@RequestParam String documentType,
                                                                         @RequestParam String documentId,
                                                                         @RequestParam String startedBy,
                                                                         @RequestBody StartProcessInstanceDto startProcessInstanceDto) {
        return ResponseEntity.ok(processDefinitionService.startProcessByDocumentType(documentType, documentId, startedBy, startProcessInstanceDto));
    }
}