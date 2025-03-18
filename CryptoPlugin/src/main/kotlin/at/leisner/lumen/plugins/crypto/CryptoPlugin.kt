package at.leisner.lumen.plugins

import at.leisner.lumen.api.plugin.LumenPlugin
import at.leisner.lumen.api.plugin.PluginInfo

@PluginInfo(
    id = "crypto",
    name = "Crypto",
    author = [ "Fantamomo" ],
    description = "Adds Crypto Utility to Lumen",
    version = "1.0-SNAPSHOT"
)
object CryptoPlugin : LumenPlugin() {

}