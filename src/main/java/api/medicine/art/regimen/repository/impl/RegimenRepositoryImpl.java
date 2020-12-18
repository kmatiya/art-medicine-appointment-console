package api.medicine.art.regimen.repository.impl;

import api.medicine.art.regimen.repository.RegimenRepository;
import metadata.RegimenNameMetaData;
import model.Regimen;

import java.util.ArrayList;
import java.util.List;

public class RegimenRepositoryImpl implements RegimenRepository {
    private List<Regimen> regimens;
    public RegimenRepositoryImpl(){
        regimens = new ArrayList<>();
        regimens.add(assignRegimen(RegimenNameMetaData.REGIMEN_0P));
        regimens.add(assignRegimen(RegimenNameMetaData.REGIMEN_0A));
        regimens.add(assignRegimen(RegimenNameMetaData.REGIMEN_2P));
        regimens.add(assignRegimen(RegimenNameMetaData.REGIMEN_2A));
        regimens.add(assignRegimen(RegimenNameMetaData.REGIMEN_4P));
        regimens.add(assignRegimen(RegimenNameMetaData.REGIMEN_4A));
        regimens.add(assignRegimen(RegimenNameMetaData.REGIMEN_5A));
        regimens.add(assignRegimen(RegimenNameMetaData.REGIMEN_6A));
        regimens.add(assignRegimen(RegimenNameMetaData.REGIMEN_7A));
        regimens.add(assignRegimen(RegimenNameMetaData.REGIMEN_8A));
        regimens.add(assignRegimen(RegimenNameMetaData.REGIMEN_9P));
        regimens.add(assignRegimen(RegimenNameMetaData.REGIMEN_9A));
        regimens.add(assignRegimen(RegimenNameMetaData.REGIMEN_10A));
        regimens.add(assignRegimen(RegimenNameMetaData.REGIMEN_11P));
        regimens.add(assignRegimen(RegimenNameMetaData.REGIMEN_11A));
        regimens.add(assignRegimen(RegimenNameMetaData.REGIMEN_12A));
        regimens.add(assignRegimen(RegimenNameMetaData.REGIMEN_13A));
        regimens.add(assignRegimen(RegimenNameMetaData.REGIMEN_14A));
        regimens.add(assignRegimen(RegimenNameMetaData.REGIMEN_15A));
    }

    public List<Regimen> getAllRegimens(){
        return regimens;
    }

    public Regimen getRegimen(String regimen){
        return assignRegimen(regimen);
    }

    private Regimen assignRegimen(String value){
        Regimen regimen = new Regimen();
        if(value.equals(RegimenNameMetaData.REGIMEN_0P)){
            regimen.setKey(0);
            regimen.setName(RegimenNameMetaData.REGIMEN_0P);
            return regimen;
        }
        if(value.equals(RegimenNameMetaData.REGIMEN_0A)){
            regimen.setKey(1);
            regimen.setName(RegimenNameMetaData.REGIMEN_0A);
            return regimen;
        }
        if(value.equals(RegimenNameMetaData.REGIMEN_2P)){
            regimen.setKey(2);
            regimen.setName(RegimenNameMetaData.REGIMEN_2P);
            return regimen;
        }
        if(value.equals(RegimenNameMetaData.REGIMEN_2A)){
            regimen.setKey(3);
            regimen.setName(RegimenNameMetaData.REGIMEN_2A);
            return regimen;
        }
        if(value.equals(RegimenNameMetaData.REGIMEN_4A)){
            regimen.setKey(4);
            regimen.setName(RegimenNameMetaData.REGIMEN_4A);
            return regimen;
        }
        if(value.equals(RegimenNameMetaData.REGIMEN_4P)){
            regimen.setKey(5);
            regimen.setName(RegimenNameMetaData.REGIMEN_4P);
            return regimen;
        }
        if(value.equals(RegimenNameMetaData.REGIMEN_5A)){
            regimen.setKey(6);
            regimen.setName(RegimenNameMetaData.REGIMEN_5A);
            return regimen;
        }
        if(value.equals(RegimenNameMetaData.REGIMEN_6A)){
            regimen.setKey(7);
            regimen.setName(RegimenNameMetaData.REGIMEN_6A);
            return regimen;
        }
        if(value.equals(RegimenNameMetaData.REGIMEN_7A)){
            regimen.setKey(8);
            regimen.setName(RegimenNameMetaData.REGIMEN_7A);
            return regimen;
        }
        if(value.equals(RegimenNameMetaData.REGIMEN_8A)){
            regimen.setKey(9);
            regimen.setName(RegimenNameMetaData.REGIMEN_8A);
            return regimen;
        }
        if(value.equals(RegimenNameMetaData.REGIMEN_9P)){
            regimen.setKey(10);
            regimen.setName(RegimenNameMetaData.REGIMEN_9P);
            return regimen;
        }
        if(value.equals(RegimenNameMetaData.REGIMEN_9A)){
            regimen.setKey(11);
            regimen.setName(RegimenNameMetaData.REGIMEN_9A);
            return regimen;
        }
        if(value.equals(RegimenNameMetaData.REGIMEN_10A)){
            regimen.setKey(12);
            regimen.setName(RegimenNameMetaData.REGIMEN_10A);
            return regimen;
        }
        if(value.equals(RegimenNameMetaData.REGIMEN_11P)){
            regimen.setKey(13);
            regimen.setName(RegimenNameMetaData.REGIMEN_11P);
            return regimen;
        }
        if(value.equals(RegimenNameMetaData.REGIMEN_11A)){
            regimen.setKey(14);
            regimen.setName(RegimenNameMetaData.REGIMEN_11A);
            return regimen;
        }
        if(value.equals(RegimenNameMetaData.REGIMEN_12A)){
            regimen.setKey(15);
            regimen.setName(RegimenNameMetaData.REGIMEN_12A);
            return regimen;
        }
        if(value.equals(RegimenNameMetaData.REGIMEN_13A)){
            regimen.setKey(16);
            regimen.setName(RegimenNameMetaData.REGIMEN_13A);
            return regimen;
        }
        if(value.equals(RegimenNameMetaData.REGIMEN_14A)){
            regimen.setKey(17);
            regimen.setName(RegimenNameMetaData.REGIMEN_14A);
            return regimen;
        }
        if(value.equals(RegimenNameMetaData.REGIMEN_15A)){
            regimen.setKey(18);
            regimen.setName(RegimenNameMetaData.REGIMEN_15A);
            return regimen;
        }
        return null;
    }
}
