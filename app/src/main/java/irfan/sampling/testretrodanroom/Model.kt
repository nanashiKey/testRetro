package irfan.sampling.testretrodanroom


/**
 *   created by Irfan Assidiq on 4/6/19
 *   email : assidiq.irfan@gmail.com
 **/
object Model {
    data class Result(val query: Query)
    data class Query(val searchinfo: SearchInfo)
    data class SearchInfo(val totalhits: Int)
}