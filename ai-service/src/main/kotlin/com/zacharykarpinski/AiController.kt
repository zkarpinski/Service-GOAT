package com.zacharykarpinski


import com.theokanning.openai.OpenAiService
import com.theokanning.openai.completion.CompletionChoice
import com.theokanning.openai.completion.CompletionRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.QueryValue
import java.util.function.Consumer

@Controller("/query")
class MyController {

    @Get("/")
    fun example(@QueryValue q: String): HttpResponse<String> {
        var sb = StringBuilder()
        val service = OpenAiService("API_KEY_HERE")
        //var req =
        val completionRequest = CompletionRequest.builder()
                .prompt(q)
                .model("text-davinci-003")
                .echo(false)
                .n(2)
                .build()
        service.createCompletion(completionRequest).choices.forEach(Consumer { x: CompletionChoice? -> sb.append(x) })
        return HttpResponse.ok("Response for: $q <p>${sb.toString()}</p>")
    }

}