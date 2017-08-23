package com.github.kamikazik.typesafe

import com.typesafe.config.Config

package object config {
  implicit class OptionalConfigWrapper(override val underlying: Config) extends AnyVal with OptionalConfig
}
