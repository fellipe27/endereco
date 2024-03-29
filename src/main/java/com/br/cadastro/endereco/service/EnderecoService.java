package com.br.cadastro.endereco.service;

import com.br.cadastro.endereco.feign.EnderecoFeign;
import com.br.cadastro.endereco.model.dto.EnderecoRequest;
import com.br.cadastro.endereco.model.dto.EnderecoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnderecoService {
    private final EnderecoFeign enderecoFeign;

    public EnderecoResponse executa(EnderecoRequest enderecoRequest) {
        return enderecoFeign.buscaEnderecoCep(enderecoRequest.getCep());
    }
}
