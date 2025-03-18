package at.leisner.lumen.plugin.crypto

import at.leisner.lumen.api.result.DirectResultProvider
import at.leisner.lumen.api.result.MappedQueryResult
import at.leisner.lumen.api.result.QueryResult
import at.leisner.lumen.api.result.QueryResult.DirectQueryResult
import at.leisner.lumen.api.result.queryResultOf
import java.util.UUID

class CryptoProvider : DirectResultProvider {
    override val keyword = "#"

    val default = listOf(
        DirectQueryResult("# hash", "Hash", override = true),
        DirectQueryResult("# uuid", "Generate UUIDs", override = true)
    )

    override fun suggest(query: String): List<QueryResult> {
        val args = query.split(" ")
        if (args.isEmpty() || args[0].isBlank()) return default
        when (args[0]) {
            "uuid" -> {
                val uuid = UUID.randomUUID()
                return listOf(
                    MappedQueryResult(
                        queryResultOf(uuid.toString(), "Press enter to copy"),
                        setOf()
                    ) {
                        println(uuid)
                    }
                )
            }
        }
        return listOf()
    }

    override fun suggest(query: String, global: Boolean): List<QueryResult> = if (global) listOf() else suggest(query)
}