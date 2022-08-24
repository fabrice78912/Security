package com.keycloak.oauth.config;


import org.jboss.resteasy.core.Dispatcher;
import org.jboss.resteasy.spi.ResteasyProviderFactory;
import org.keycloak.common.util.ResteasyProvider;

public class Resteasy3Provider implements ResteasyProvider {
    @Override
    public <R> R getContextData(Class<R> type) {
        //ResteasyProviderFactory.getInstance();
        return ResteasyProviderFactory.getInstance().getContextData(type);
    }

    @Override
    public void pushDefaultContextObject(Class type, Object instance) {
        //ResteasyProviderFactory.getInstance();
        ResteasyProviderFactory.getInstance().getContextData(Dispatcher.class).getDefaultContextObjects().put(type, instance);
    }

    @Override
    public void pushContext(Class type, Object instance) {
        ResteasyProviderFactory.getInstance();
        ResteasyProviderFactory.pushContext(type, instance);
    }

    @Override
    public void clearContextData() {
        ResteasyProviderFactory.getInstance();
        ResteasyProviderFactory.clearContextData();
    }
}
