package br.com.service;

import br.com.model.Orcamento;
import br.com.repository.OrcamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrcamentoService {


        @Autowired
        private OrcamentoRepository moduloRepository;

        public void save(Orcamento orcamento) {
            moduloRepository.save(orcamento);
        }

        public List<Orcamento> findAll() {
            return moduloRepository.findAll();
        }

        public Optional<Orcamento> findById(String id) {
            return  moduloRepository.findById(id);
        }

        public void delete(String id) {
            moduloRepository.deleteById(id);
        }
    }
