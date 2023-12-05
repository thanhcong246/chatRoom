package org.sopiro.chat.utils

import java.awt.Font
import java.awt.Image
import javax.imageio.ImageIO

object Resources {
    val font16 = Font("sansserif", Font.PLAIN, 16)
    val font12 = Font("sansserif", Font.PLAIN, 12)
    val icon: Image

    val DEFAULT_MSG = "start -p 1234"

    var language: Lang = Lang.ENG

    enum class Lang {
        KOR, ENG, VN
    }

    val COLUMN_NAMES: List<String>
        get() {
            return when (language) {
                Lang.KOR -> listOf("방장", "방제", "인원수")
                Lang.ENG -> listOf("Master", "Title", "Members")
                Lang.VN -> listOf("Chủ phòng", "Tiêu đề", "Thành viên")
            }
        }


    val OK: String
        get() {
            return when (language) {
                Lang.KOR -> "확인"
                Lang.ENG -> "OK"
                Lang.VN -> "Đồng ý"
            }
        }

    val SETTINGS: String
        get() {
            return when (language) {
                Lang.KOR -> "설정"
                Lang.ENG -> "Settings"
                Lang.VN -> "Cài đặt"
            }
        }

    val MASTER_SERVER_CLOSED: String
        get() {
            return when (language) {
                Lang.KOR -> "마스터 서버가 닫혀있습니다."
                Lang.ENG -> "Master server is currently closed"
                Lang.VN -> "Máy chủ chính đang đóng cửa"
            }
        }


    val MASTER_SERVER_JUST_CLOSED: String
        get() {
            return when (language) {
                Lang.KOR -> "마스터 서버가 닫혔습니다."
                Lang.ENG -> "Master server closed"
                Lang.VN -> "Máy chủ chính đã đóng"
            }
        }

    val MASTER_SERVER_SETTING: String
        get() {
            return when (language) {
                Lang.KOR -> "마스터 서버 설정"
                Lang.ENG -> "Master server setting"
                Lang.VN -> "Cấu hình máy chủ chính"
            }
        }

    val NEW_ROOM: String
        get() {
            return when (language) {
                Lang.KOR -> "방 만들기"
                Lang.ENG -> "Create"
                Lang.VN -> "Tạo phòng"
            }
        }

    val ENTER_ROOM: String
        get() {
            return when (language) {
                Lang.KOR -> "접속"
                Lang.ENG -> "Enter"
                Lang.VN -> "Vào"
            }
        }

    val REFRESH: String
        get() {
            return when (language) {
                Lang.KOR -> "새로고침"
                Lang.ENG -> "Refresh"
                Lang.VN -> "Làm mới"
            }
        }

    val CORRECT_PLS: String
        get() {
            return when (language) {
                Lang.KOR -> "제대로 입력해주세요"
                Lang.ENG -> "Please enter correctly"
                Lang.VN -> "Vui lòng nhập đúng"
            }
        }

    val CORRECT_PLS_IP_PORT: String
        get() {
            return when (language) {
                Lang.KOR -> "서버 IP와 포트를 제대로 입력해주세요."
                Lang.ENG -> "Please enter the server IP, port correctly"
                Lang.VN -> "Vui lòng nhập đúng địa chỉ IP và cổng của máy chủ"
            }
        }

    val SELECT_PLS: String
        get() {
            return when (language) {
                Lang.KOR -> "방을 선택해 주세요"
                Lang.ENG -> "Please select a room"
                Lang.VN -> "Vui lòng chọn một phòng"
            }
        }

    val HOST_ERR: String
        get() {
            return when (language) {
                Lang.KOR -> "당신은 방을 만들 수 없습니다.\n호스트 서버 에러"
                Lang.ENG -> "You can't host a room.\nNetwork error"
                Lang.VN -> "Bạn không thể tạo phòng.\nLỗi mạng"
            }
        }

    val NOTICE: String
        get() {
            return when (language) {
                Lang.KOR -> "알림"
                Lang.ENG -> "Notice"
                Lang.VN -> "Thông báo"
            }
        }

    val LANG_SETT: String
        get() {
            return when (language) {
                Lang.KOR -> "언어 설정"
                Lang.ENG -> "Language setting"
                Lang.VN -> "Cài đặt ngôn ngữ"
            }
        }

    val NICK_NAME: String
        get() {
            return when (language) {
                Lang.KOR -> "닉네임"
                Lang.ENG -> "Nickname"
                Lang.VN -> "Biệt danh"
            }
        }

    val ROOM_TITLE: String
        get() {
            return when (language) {
                Lang.KOR -> "방 이름"
                Lang.ENG -> "Room title"
                Lang.VN -> "Tên phòng"
            }
        }

    val MS_IP: String
        get() {
            return when (language) {
                Lang.KOR -> "마스터서버 IP"
                Lang.ENG -> "Master server IP"
                Lang.VN -> "Địa chỉ IP máy chủ chính"
            }
        }

    val MS_PORT: String
        get() {
            return when (language) {
                Lang.KOR -> "마스터서버 port"
                Lang.ENG -> "Master server port"
                Lang.VN -> "Cổng máy chủ chính"
            }
        }

    val ENTER: String
        get() {
            return when (language) {
                Lang.KOR -> "입력"
                Lang.ENG -> "Enter"
                Lang.VN -> "Nhập"
            }
        }

    val MEMBERS: String
        get() {
            return when (language) {
                Lang.KOR -> "참가자"
                Lang.ENG -> "Members"
                Lang.VN -> "Thành viên"
            }
        }

    val LEFT_ROOM: String
        get() {
            return when (language) {
                Lang.KOR -> "방장이 방을 나갔습니다."
                Lang.ENG -> "Room host has left the room"
                Lang.VN -> "Chủ phòng đã rời khỏi phòng"
            }
        }

    val SOMEONE_ENTER: String
        get() {
            return when (language) {
                Lang.KOR -> "님이 입장하셨습니다."
                Lang.ENG -> "entered the room."
                Lang.VN -> "vừa vào phòng."
            }
        }

    val SOMEONE_OUT: String
        get() {
            return when (language) {
                Lang.KOR -> "님이 퇴장하셨습니다."
                Lang.ENG -> "left the room."
                Lang.VN -> "vừa rời khỏi phòng."
            }
        }

    val ROOM_LIST: String
        get() {
            return when (language) {
                Lang.KOR -> "방 목록"
                Lang.ENG -> "Room List"
                Lang.VN -> "Danh sách phòng"
            }
        }

    init {
        icon = ImageIO.read(Resources.javaClass.classLoader.getResourceAsStream("icon.png"))
    }
}