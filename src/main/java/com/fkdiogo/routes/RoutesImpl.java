package com.fkdiogo.routes;

/**
 * Created by felipediogo on 09/12/16.
 */

import javax.ejb.Stateless;

@Stateless
public class RoutesImpl implements Routes {

    public String index(String name) {
        return String.format("Hello %s", name);
    }
}
