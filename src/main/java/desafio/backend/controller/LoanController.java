package desafio.backend.controller;


import desafio.backend.modal.JurosModal;
import desafio.backend.modal.LoansResponseModal;
import desafio.backend.services.LoansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/customer-loans")
public class LoanController {
    @Autowired
    private LoansService loansService;

    @PostMapping
    public Map<String, Object> getAvailableLoans(@RequestBody JurosModal jurosModal) {

        List<LoansResponseModal> loans = loansService.determineLoans(jurosModal);

        Map<String, Object> response = new HashMap<>();
        response.put("customer", jurosModal.getName());
        response.put("loans", loans);

        return response;
    }


}
