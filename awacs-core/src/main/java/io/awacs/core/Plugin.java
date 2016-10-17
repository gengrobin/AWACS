/**
 * Copyright 2016 AWACS Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package io.awacs.core;

import java.lang.instrument.Instrumentation;

/**
 *
 * Created by pixyonly on 7/5/16.
 */
public interface Plugin {

    PluginDescriptor getDescriptor();

    void setDescriptor(PluginDescriptor descriptor);

    Instrumentation getInstrumentation();

    void setInstrumentation(Instrumentation inst);

    void boot();

}