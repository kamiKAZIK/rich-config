package com.github.kamikazik.typesafe.config

import com.typesafe.config.Config

import scala.PartialFunction.condOpt
import scala.collection.JavaConverters._
import scala.concurrent.duration.Duration

trait OptionalConfig extends Any {
  def underlying: Config

  def getOptionalBoolean(path: String): Option[Boolean] = condOpt(underlying.hasPath(path)) {
    case true => underlying.getBoolean(path)
  }

  def getOptionalBooleanList(path: String): Option[Seq[Boolean]] = condOpt(underlying.hasPath(path)) {
    case true => underlying.getBooleanList(path)
      .asScala
      .map(Boolean.unbox(_))
  }

  def getOptionalBytes(path: String): Option[Long] = condOpt(underlying.hasPath(path)) {
    case true => underlying.getBytes(path)
  }

  def getOptionalBytesList(path: String): Option[Seq[Long]] = condOpt(underlying.hasPath(path)) {
    case true => underlying.getBytesList(path)
      .asScala
      .map(Long.unbox(_))
  }

  def getOptionalConfig(path: String): Option[Config] = condOpt(underlying.hasPath(path)) {
    case true => underlying.getConfig(path)
  }

  def getOptionalConfigList(path: String): Option[Seq[Config]] = condOpt(underlying.hasPath(path)) {
    case true => underlying.getConfigList(path)
      .asScala
  }

  def getOptionalDuration(path: String): Option[Duration] = condOpt(underlying.hasPath(path)) {
    case true => Duration.fromNanos(underlying.getDuration(path).toNanos)
  }

  def getOptionalString(path: String): Option[String] = condOpt(underlying.hasPath(path)) {
    case true => underlying.getString(path)
  }

  def getOptionalStringList(path: String): Option[Seq[String]] = condOpt(underlying.hasPath(path)) {
    case true => underlying.getStringList(path)
      .asScala
  }

  def getOptionalInt(path: String): Option[Int] = condOpt(underlying.hasPath(path)) {
    case true => underlying.getInt(path)
  }

  def getOptionalIntList(path: String): Option[Seq[Int]] = condOpt(underlying.hasPath(path)) {
    case true => underlying.getIntList(path)
      .asScala
      .map(Int.unbox(_))
  }

  def getOptionalLong(path: String): Option[Long] = condOpt(underlying.hasPath(path)) {
    case true => underlying.getLong(path)
  }

  def getOptionalLongList(path: String): Option[Seq[Long]] = condOpt(underlying.hasPath(path)) {
    case true => underlying.getLongList(path)
      .asScala
      .map(Long.unbox(_))
  }

  def getOptionalDouble(path: String): Option[Double] = condOpt(underlying.hasPath(path)) {
    case true => underlying.getDouble(path)
  }

  def getOptionalDoubleList(path: String): Option[Seq[Double]] = condOpt(underlying.hasPath(path)) {
    case true => underlying.getDoubleList(path)
      .asScala
      .map(Double.unbox(_))
  }
}
