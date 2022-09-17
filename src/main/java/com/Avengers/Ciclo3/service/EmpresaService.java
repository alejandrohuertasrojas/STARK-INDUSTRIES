package com.Avengers.Ciclo3.service;

import com.Avengers.Ciclo3.modelos.Empresa;
import com.Avengers.Ciclo3.repo.EmpreasaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaService {
    @Autowired //Conectamos esta clase con el repository de Empresa
    EmpreasaRepository empreasaRepository; //Creamos un objeto tipo EmpresaRepository para poder usar los metodos que dicha clase hereda

    //Metodo que retornara la lista de empresas usando metodos del jpaRepository
    public List<Empresa> getAllEmpresas(){
        List<Empresa> empresaList = new ArrayList<>();
        empreasaRepository.findAll(). forEach(empresa -> empresaList.add(empresa)); //Recorremos el iterable que regresa el metodo findAll del Jpa ylo guardamos en la lista
        return empresaList;
}

    //Metodo que me trae un objeto de tipo Empresa cuando cuento con el id de la misma
    public Empresa getEmpresaById(Integer id){
        return empreasaRepository.findById(id).get();
}

    //Metodo para guardar o actulizar objetos de tipo Empresa
    public boolean saveOrUpdateEmpresa(Empresa empresa) {
        Empresa emp = empreasaRepository.save(empresa);
        if (empreasaRepository.findById(emp.getId()) != null){
            return true;
        }
        return false;
    }

  //Metodo delete pendiente
}
