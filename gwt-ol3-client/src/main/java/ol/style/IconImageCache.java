/*******************************************************************************
 * Copyright 2014, 2021 gwt-ol
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package ol.style;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Cache for icon images.
 *
 * @author Tino Desjardins
 *
 */
@JsType(isNative = true)
public class IconImageCache {

    /**
     * Set the cache size of the icon cache. Default is `32`. Change this value when
     * your map uses more than 32 different icon images and you are not caching icon
     * styles on the application level.
     */
    public native void setSize(int maxCacheSize);

    @JsOverlay
    public static final IconImageCache get() {
        return getShared();
    };

    @JsProperty
    public static native IconImageCache getShared();

}
