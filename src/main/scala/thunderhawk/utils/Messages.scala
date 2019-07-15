package thunderhawk.utils

object Messages {

  // Requests
  case class ParseRequest(message: String)

  // Responses
  case class UserResponse(username: String)
  case class NickResponse(nickname: String)
}