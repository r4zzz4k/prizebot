package me.y9san9.prizebot.extensions.telegram

import me.y9san9.fsm.FSMState
import me.y9san9.fsm.FSMStorage
import me.y9san9.prizebot.actors.storage.language_codes_storage.LanguageCodesStorage
import me.y9san9.prizebot.models.di.PrizebotDI
import me.y9san9.telegram.updates.CallbackQueryUpdate
import me.y9san9.telegram.updates.ChosenInlineResultUpdate
import me.y9san9.telegram.updates.InlineQueryUpdate
import me.y9san9.telegram.updates.PrivateMessageUpdate
import me.y9san9.telegram.updates.hierarchies.FromChatLocalizedDIBotUpdate
import me.y9san9.telegram.updates.hierarchies.FromChatLocalizedDIUpdate


typealias PrizebotPrivateMessageUpdate = PrivateMessageUpdate<PrizebotDI>
typealias PrizebotInlineQueryUpdate = InlineQueryUpdate<PrizebotDI>
typealias PrizebotChosenInlineResultUpdate = ChosenInlineResultUpdate<PrizebotDI>
typealias PrizebotCallbackQueryUpdate = CallbackQueryUpdate<PrizebotDI>
typealias PrizebotFSMStorage = FSMStorage<Long, Any?>
typealias PrizebotFSMState<TDataIn> = FSMState<TDataIn, PrizebotPrivateMessageUpdate>
typealias PrizebotLocalizedUpdate = FromChatLocalizedDIUpdate<LanguageCodesStorage>
typealias PrizebotLocalizedBotUpdate = FromChatLocalizedDIBotUpdate<LanguageCodesStorage>