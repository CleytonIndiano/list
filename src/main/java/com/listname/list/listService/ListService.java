package com.listname.list.listService;

import com.listname.list.listDto.ListDto;
import com.listname.list.listEntity.ListName;
import com.listname.list.listRepository.ListRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListService {
    private final ListRepository listRepository;

    public ListService(ListRepository listRepository){
        this.listRepository = listRepository;

    }

    public ListName saveName(ListDto listDto){
        ListName listName = new ListName();
        listName.setName(listDto.getName());
        listName.setLocaldate(listDto.getLocaldate());

        return listRepository.save(listName);
    }
    public List<ListName> getAlllistName(){
        return listRepository.findAll();
    }


}
