/*
 * Copyright (c) 2019-2029, Dreamlu 卢春梦 (596392912@qq.com & www.dreamlu.net).
 * <p>
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE 3.0;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.gnu.org/licenses/lgpl.html
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.dreamlu.mica.nats.config;

import io.nats.client.api.StreamConfiguration;

/**
 * nats stream StreamConfiguration 自定义配置
 *
 * @author L.cm
 */
@FunctionalInterface
public interface NatsStreamCustomizer {

    /**
     * Customize the StreamConfiguration.
     *
     * @param builder the StreamConfiguration Builder configuration to customize
     */
    void customize(StreamConfiguration.Builder builder);

}
