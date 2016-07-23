/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopingcart;

/**
 *
 * @author AbdelRahman
 */
public abstract class AbstractProduct implements Service {

    private int id;
    private String name;
    private String type;
    private String about;

    /**
     *
     * @return
     */
    public int getID() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setID(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String about() {
        return about;
    }

    @Override
    public void setAbout(String about) {
        this.about = about;
    }
    
}
