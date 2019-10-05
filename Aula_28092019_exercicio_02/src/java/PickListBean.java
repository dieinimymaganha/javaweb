/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import org.primefaces.model.DualListModel;

/**
 *
 * @author Dieinimy
 */
@Named
@RequestScoped
public class PickListBean {

    private DualListModel<String> cities;

    @PostConstruct
    public void init() {
        List<String> source = new ArrayList<String>();
        List<String> target = new ArrayList<String>();
        source.add("Istanbul");
        source.add("Ankara");
        source.add("Izmir");
        source.add("Antalya");
        source.add("Bursa");
        cities = new DualListModel<String>(source,
                target);
    }

    public DualListModel<String> getCities() {
        return cities;
    }

    public void setCities(DualListModel<String> cities) {
        this.cities = cities;
    }
}
