package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sign_005fup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <title>Sign Up</title>\n");
      out.write("        <!-- Styles -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"/Desafio_Everymind/css/sign_in.css\">\n");
      out.write("        <!-- Scripts -->\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body\n");
      out.write("        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loggedUser == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <div class=\"container\" style=\"margin-top:40px\">\n");
        out.write("                <div class=\"row\">\n");
        out.write("                    <div class=\"col-sm-6 col-md-4 col-md-offset-4\">\n");
        out.write("                        <div class=\"panel panel-default\">\n");
        out.write("                            <div class=\"panel-heading\">\n");
        out.write("                                <strong> Sign Up</strong>\n");
        out.write("                            </div>\n");
        out.write("                            <div class=\"panel-body\">\n");
        out.write("                                <form role=\"form\" name=\"userForm\" action=\"../createUser\" method=\"POST\" id=\"formValidation\" onsubmit=\"return validaForm(this);\">\n");
        out.write("                                    <fieldset>\n");
        out.write("                                        <!-- Logo -->\n");
        out.write("                                        <div class=\"row\">\n");
        out.write("                                            <div class=\"center-block\">\n");
        out.write("                                                <img class=\"profile-img\"\n");
        out.write("                                                     src=\"data:image/png;base64,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\" alt=\"\">\n");
        out.write("                                            </div>\n");
        out.write("                                        </div>\n");
        out.write("                                        <div class=\"row\">\n");
        out.write("                                            <div class=\"col-sm-12 col-md-10  col-md-offset-1 \">\n");
        out.write("                                                <!-- Name -->\n");
        out.write("                                                <div class=\"form-group\">\n");
        out.write("                                                    <label for=\"name\">Full Name</label>\n");
        out.write("                                                    <div class=\"input-group\">\n");
        out.write("                                                        <span class=\"input-group-addon\">\n");
        out.write("                                                            <i class=\"glyphicon glyphicon-info-sign\"></i>\n");
        out.write("                                                        </span> \n");
        out.write("                                                        <input class=\"form-control\" name=\"name\"  type=\"text\" id=\"name\" autofocus required>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </div>\n");
        out.write("                                                <!-- E-mail -->\n");
        out.write("                                                <div class=\"form-group\">\n");
        out.write("                                                    <label for=\"email\">E-mail</label>\n");
        out.write("                                                    <div class=\"input-group\">\n");
        out.write("                                                        <span class=\"input-group-addon\">\n");
        out.write("                                                            <i class=\"glyphicon glyphicon-envelope\"></i>\n");
        out.write("                                                        </span> \n");
        out.write("                                                        <input class=\"form-control\" name=\"email\" type=\"email\" id=\"email\" autofocus required>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </div>\n");
        out.write("                                                <!-- Username -->\n");
        out.write("                                                <div class=\"form-group\">\n");
        out.write("                                                    <label for=\"username\">Username</label>\n");
        out.write("                                                    <div class=\"input-group\">\n");
        out.write("                                                        <span class=\"input-group-addon\">\n");
        out.write("                                                            <i class=\"glyphicon glyphicon-user\"></i>\n");
        out.write("                                                        </span>\n");
        out.write("                                                        <input class=\"form-control alert-sucess\" name=\"username\" type=\"text\" id=\"usuername\" autofocus required>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </div>\n");
        out.write("                                                <!-- Password -->\n");
        out.write("                                                <div class=\"form-group\">\n");
        out.write("                                                    <label for=\"password\">Password</label>\n");
        out.write("\n");
        out.write("                                                    <div class=\"input-group\">\n");
        out.write("                                                        <span class=\"input-group-addon\">\n");
        out.write("                                                            <i class=\"glyphicon glyphicon-lock\"></i>\n");
        out.write("                                                        </span>\n");
        out.write("                                                        <input class=\"form-control\"  name=\"password\" type=\"password\" id=\"password\" value=\"\" required>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </div>\n");
        out.write("                                                <!-- Confirm Password -->\n");
        out.write("                                                <div class=\"form-group\">\n");
        out.write("                                                    <label for=\"confirmpassword\">Confirm Password</label>\n");
        out.write("                                                    <div class=\"input-group\">\n");
        out.write("                                                        <span class=\"input-group-addon\">\n");
        out.write("                                                            <i class=\"glyphicon glyphicon-lock\"></i>\n");
        out.write("                                                        </span>\n");
        out.write("                                                        <input class=\"form-control\"  name=\"confirm_password\" type=\"password\" id=\"confirm_password\" value=\"\" required>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </div>\n");
        out.write("                                                <div class=\"form-group\">\n");
        out.write("                                                    <input type=\"submit\" id=\"submit\" class=\"btn btn-lg btn-primary btn-block\" onClick=\"return validar_form()\" value=\"Sign up\">\n");
        out.write("                                                </div>\n");
        out.write("                                            </div>\n");
        out.write("                                        </div>\n");
        out.write("                                    </fieldset>\n");
        out.write("                                </form>\n");
        out.write("                            </div>\n");
        out.write("                            <div class=\"panel-footer \">\n");
        out.write("                                Have an account!\n");
        out.write("                                <a href=\"sign_in.jsp\"> Sign In Here </a>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("                    </div>\n");
        out.write("                </div>\n");
        out.write("            </div>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loggedUser != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <script>\n");
        out.write("                window.location.href = \"jsp/userArea.jsp\";\n");
        out.write("            </script>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
