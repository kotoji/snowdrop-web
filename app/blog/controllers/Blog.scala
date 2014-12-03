package controllers

import play.api._
import play.api.mvc._

object Blog extends Controller {
  
  def index = Action {
    Ok(blog.views.html.index())
  }

}
