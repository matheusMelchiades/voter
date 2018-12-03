package br.edu.ulbra.election.voter.repository;

import br.edu.ulbra.election.voter.model.Voter;
import org.apache.el.stream.Optional;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VoterRepository extends CrudRepository<Voter, Long> {
    Voter findFirstByEmail(String email);
}
