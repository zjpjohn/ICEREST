package com.cybermkd.route.core;


import com.cybermkd.common.http.HttpRequest;
import com.cybermkd.common.http.HttpResponse;

/**
 * Resource
 */
public abstract class Resource {

  private RouteMatch routeMatch;

  final void setRouteMatch(RouteMatch routeMatch) {
    this.routeMatch = routeMatch;
  }

  final public String getPath() {
    return routeMatch.getPath();
  }

  final public Params getParams() {
    return routeMatch.getParams();
  }

  /**
   * Get param of any type.
   */
  final public <T> T getParam(String name) {
    return (T) (getParams().get(name));
  }

  final public HttpRequest getRequest() {
    return routeMatch.getRequest();
  }

  final public HttpResponse getResponse() {
    return routeMatch.getResponse();
  }

}


