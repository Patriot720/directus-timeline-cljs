(defproject timeline-new "1.1.7"
  :description "A simple example of how to use lein-cljsbuild"
  :source-paths ["src"]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 ; [glue "0.1.3-SNAPSHOT"]
                 [proto-repl "0.3.1"]
                 [org.clojure/clojurescript "1.10.520"]
                 [compojure "1.1.6"]
                 [hiccup "1.0.4"]]
  :plugins [[lein-cljsbuild "1.1.7"]
            [lein-ring "0.8.7"]]
  :cljsbuild {
    :builds [{:source-paths ["src"]
    :main "layout"
              :compiler {
                         :optimizations :whitespace
                         ; :main "layout"
                         ; :output-wrapper true
                         :language-in :es6
                         :modules {
                           :cljs-base {
                             :output-to "./layout.js"
                           }
                           :options {:entries #{options}
                                    :output-to "./options.js"
                                    ; :depends-on #{:layout}
                                   }

                         }
                         ; :source-map false
                         :npm-deps {"@directus/extension-toolkit" "0.3.0" }
                         }}]}
  :ring {:handler example.routes/app})
