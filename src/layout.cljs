(ns layout
  (:refer-clojure :exclude [atom])
  (:require-macros [macros :refer [inline-resource]])
  (:require
    ; [glue.core :as g :refer [atom]]
    ["@directus/extension-toolkit/mixins/layout" :as mixin])
  )
(enable-console-print!)
; (def layout (inline-resource "layout.html"))

(def vue (js-obj "default" (js-obj "template" "<div></div>"
                "mixins" (array mixin)) "__esModule" true))
(set! js/__DirectusExtension__
      vue)


; (g/defcomponent :shadow-layout
;   {
;     :template "<div></div>"
;     ; :components {}
;     :mixins [mixin]
;     ; :data (fn [])
;     ; :computed {
;     ; :days (fn [])}
;     ; :created (fn [])
;     ; :destroyed (fn [])
;     ; :methods {}
; }
;     )
