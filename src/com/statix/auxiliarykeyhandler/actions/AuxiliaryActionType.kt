/*
 * Copyright (C) 2020 Paranoid Android
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.statix.auxiliarykeyhandler.actions

import android.content.Context

import com.statix.support.extensions.AuxiliaryKeyHandlerActions

class AuxiliaryActionType(context: Context) {

    private val assistAction = AssistantAction(context)
    private val cameraAction = CameraAction(context)
    private val dndAction = DoNotDisturbAction(context)
    private val torchAction = TorchAction(context)
    private val ringerAction = RingerAction(context)

    fun getAction(action: Int): AuxiliaryAction? {
        return when (action) {
            AuxiliaryKeyHandlerActions.ACTION_ASSIST -> assistAction
            AuxiliaryKeyHandlerActions.ACTION_CAMERA -> cameraAction
            AuxiliaryKeyHandlerActions.ACTION_DND -> dndAction
            AuxiliaryKeyHandlerActions.ACTION_TORCH -> torchAction
            AuxiliaryKeyHandlerActions.ACTION_RINGER -> ringerAction
            else -> null
        }
    }
}
