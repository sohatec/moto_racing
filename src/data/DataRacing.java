package data;

import entity.MotoGp;
import entity.Racing;
import java.util.ArrayList;
import java.util.List;

public class DataRacing {

    private final List<MotoGp> dataMotoGp = new ArrayList<>();
    private final List<Racing> dataRacer = new ArrayList<>();

    public List<MotoGp> getDataMotoGp(){
        return dataMotoGp;
    }

    public List<Racing> getDataRacer(){
        return dataRacer;
    }
}