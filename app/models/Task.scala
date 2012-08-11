package models

import java.lang._

case class Task(id: Integer, label: String)

object Task {
  def all(): List[Task] = Nil

  def create(label: String) {}

  def delete(id: Integer) = {}
}
