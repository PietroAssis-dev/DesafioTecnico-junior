package desafio.backend.services;


import desafio.backend.modal.JurosModal;
import desafio.backend.modal.LoansResponseModal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class LoansService {
    public List<LoansResponseModal> determineLoans(JurosModal jurosModal){

        int age = jurosModal.getAge();
        double income = jurosModal.getIncome();
        String location  = jurosModal.getLocation();

        List<LoansResponseModal> loans = new ArrayList<>();

            if (income  <= 3000){
                loans.add(new LoansResponseModal("Personal", 4));
                loans.add(new LoansResponseModal("Guaranteed", 3));
            }
            if (income <= 5000){
                loans.add(new LoansResponseModal("Consignment", 2));
            }

            if(income > 3000 && income <= 5000 && age < 30 && "SP".equalsIgnoreCase(location)){
                loans.add(new LoansResponseModal("Personal", 4 ));
                loans.add(new LoansResponseModal("Guaranteed", 3));
            }



        return loans;
    }
}
