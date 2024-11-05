package iuh.fit.dhktpm117ctt.group06.services;

import iuh.fit.dhktpm117ctt.group06.entities.CitizenCard;

import java.util.List;
import java.util.Optional;

public interface CitizenCardService {
    Optional<CitizenCard> findByCardNumber(String cardNumber);
    void deleteByCardNumber(String cardNumber);
    CitizenCard save(CitizenCard citizenCard);
    List<CitizenCard> findAll();
}