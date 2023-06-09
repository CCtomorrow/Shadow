/*
 * Tencent is pleased to support the open source community by making Tencent Shadow available.
 * Copyright (C) 2019 THL A29 Limited, a Tencent company.  All rights reserved.
 *
 * Licensed under the BSD 3-Clause License (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 *     https://opensource.org/licenses/BSD-3-Clause
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.tencent.shadow.core.gradle.extensions

open class PluginInfoConfig {
    /**
     * 插件我们认为key是唯一的
     */
    var partKey = ""

    /**
     * 插件的版本每次如果升级的话，表示是一个新插件
     */
    var version = ""
    var dependsOn: Array<String> = emptyArray()
    var hostWhiteList: Array<String> = emptyArray()

    constructor() {
    }

    override fun toString(): String {
        return "PluginInfoConfig(partKey='$partKey', version='$version', " +
                "dependsOn=${dependsOn.contentToString()}, hostWhiteList=${hostWhiteList.contentToString()})"
    }

}