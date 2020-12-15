package ru.ought.kotestspring

import io.kotest.core.config.AbstractProjectConfig
import io.kotest.core.extensions.Extension
import io.kotest.core.spec.IsolationMode
import io.kotest.spring.SpringAutowireConstructorExtension

class ProjectConfig: AbstractProjectConfig() {
    override fun extensions(): List<Extension> = listOf(SpringAutowireConstructorExtension)
    override val isolationMode = IsolationMode.InstancePerLeaf
}