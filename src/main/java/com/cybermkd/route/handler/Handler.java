package com.cybermkd.route.handler;

import com.cybermkd.common.http.HttpRequest;
import com.cybermkd.common.http.HttpResponse;

/**
 * Handler.
 * You can config Handler in Config.configHandler() method,
 * Handler can do anything under the ICEREST route.
 */
public abstract class Handler {

  protected Handler nextHandler;

  /**
   * Handle target
   *
   * @param request   HttpServletRequest of this http request
   * @param response  HttpServletRequest of this http request
   * @param isHandled ICERESTFilter will invoke doFilter() method if isHandled[0] == false,
   *                  it is usually to tell Filter should handle the static resource.
   */
  public abstract void handle(HttpRequest request, HttpResponse response, boolean[] isHandled);
}




