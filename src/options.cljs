(ns options
  (:require
    ; [glue.core :as g :refer [atom]]
    ["@directus/extension-toolkit/mixins/layout" :as mixin ])
  )

(def vue (js-obj "default" (js-obj "template" "<div></div>"
                "mixins" (array mixin)) "__esModule" true))
(set! js/__DirectusExtension__
      vue)
