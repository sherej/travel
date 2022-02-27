package com.example.travel.service;

import com.example.travel.common.BaseMapper;
import com.example.travel.common.BaseRepository;
import com.example.travel.common.BaseServiceImpl;
import com.example.travel.dto.TerminalDTO;
import com.example.travel.entity.Terminal;
import com.example.travel.mapper.TerminalMapper;
import com.example.travel.repository.TerminalRepository;
import com.example.travel.service.iservice.TerminalService;
import org.springframework.stereotype.Service;

@Service
public class TerminalServiceImpl extends BaseServiceImpl<Terminal, TerminalDTO,Long> implements TerminalService {
    private final TerminalRepository repo;

    private final TerminalMapper mapper;

    public TerminalServiceImpl(TerminalRepository repo,TerminalMapper  mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    @Override
    protected BaseRepository<Terminal, Long> getRepo() {
        return repo;
    }

    @Override
    protected BaseMapper<Terminal, TerminalDTO> getMapper() {
        return mapper;
    }
}
