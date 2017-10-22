/*
 *    Copyright 2017. iota9star
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package star.iota.acgrip

import android.app.Activity
import android.content.Context
import android.text.TextUtils
import com.liuguangqiang.cookie.CookieBar
import java.util.*


object MessageBar {
    private val FACES = arrayOf("ヽ(✿ﾟ▽ﾟ)ノ", "━━(￣ー￣*|||━━", "┗|*｀0′*|┛", "o(*^▽^*)┛", "( σ'ω')σ", "✧(≖ ◡ ≖✿)", "|(•_•) |•_•) |_•) |•) | )", "(ﾟｰﾟ)", "´･∀･)乂(･∀･｀", "(。・∀・)ノ", "(oﾟvﾟ)ノ", "(*ﾟｰﾟ)", "ʅ（´◔౪◔）ʃ", "(‾◡◝)", "(☆-ｖ-)", "*(੭*ˊᵕˋ)੭*ଘ", "(>▽<)", "┗|｀O′|┛ 嗷~~", "<(￣3￣)> 表！", "不＞(￣ε￣ = ￣3￣)<要", "(≧∇≦)ﾉ", "～(　TロT)σ", "n(*≧▽≦*)n", "（*＾-＾*）", "（○｀ 3′○）", "（○｀ 3′○）", "( *￣▽￣)((≧︶≦*)", "(っ*´Д`)っ", "ο(=•ω＜=)ρ⌒☆", "ヾ(´･ω･｀)ﾉ", "ヾ(^▽^*)))", "ｍ(o・ω・o)ｍ", "ε = = (づ′▽`)づ", "(ノω<。)ノ))☆.。", "(。・・)ノ", "(/ω＼*)……… (/ω•＼*)", "┬┴┤_•)", "（o´・ェ・｀o）", "(#`O′)", "o(〃'▽'〃)o", "( ╯▽╰)", "(～o￣3￣)～", "(*￣3￣)╭", "（づ￣3￣）づ╭❤～", "(。﹏。)", "(/▽＼)", "(′▽`〃)", "◕ฺ‿◕ฺ✿ฺ)", "(*/ω＼*)", "(๑•̀ㅂ•́)و✧", "ヾ(≧▽≦*)o", "o(*≧▽≦)ツ", "<(￣︶￣)>", "︿(￣︶￣)︿", "嗯~ o(*￣▽￣*)o", "╰(￣▽￣)╭", "(｡･∀･)ﾉﾞ", "ヾ(≧∇≦*)ゝ", "(*^▽^*)", "╰(￣▽￣)╭", "（゜▽＾*））", "ヽ(✿ﾟ▽ﾟ)ノ", "(( へ(へ´∀`)へ", "╰(*°▽°*)╯", "^O^", "♪(^∇^*)", "(≧∀≦)ゞ", "(๑´ㅂ`๑)", "(๑¯∀¯๑)", "(/≧▽≦)/", "ヽ(ﾟ∀ﾟ*)ﾉ━━━ｩ♪", "o(*≧▽≦)ツ┏━┓", "ε(*´･∀･｀)зﾞ", "~(～￣▽￣)～", "(o゜▽゜)o☆", "o(*￣▽￣*)o")

    fun create(context: Context, content: String?) {
        if (TextUtils.isEmpty(content?.trim())) return
        CookieBar.Builder(context as Activity)
                .setTitle(FACES[Random().nextInt(FACES.size)])
                .setMessage(content)
                .show()
    }
}

