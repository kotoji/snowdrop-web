package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index())
  }

  def about = Action {
    Ok(views.html.about())
  }

  def member = Action {
    Ok(views.html.member("test"))
  }

  def gallery = Action {
    Ok(views.html.gallery())
  }

  def link = Action {
    Ok(views.html.link())
  }

}
