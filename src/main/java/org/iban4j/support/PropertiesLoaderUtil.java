/*
 * Copyright 2013 Artur Mkrtchyan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.iban4j.support;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Utility which helps to load properties file.
 */
class PropertiesLoaderUtil {

    private PropertiesLoaderUtil() {
    }

    /**
     * Loads and returns properties object.
     *
     * @param path to properties file
     * @return properties object
     * @throws IOException
     */
    static Properties loadProperties(String path) throws IOException {
        Properties properties = new Properties();
        InputStream is = PropertiesLoaderUtil.class.getClassLoader().getResourceAsStream(path);

        try {
            properties.load(is);
        } finally {
            is.close();
        }

        return properties;

    }
}