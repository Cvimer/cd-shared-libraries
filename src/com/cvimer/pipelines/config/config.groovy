package com.cvimer.pipelines.config;


def config() {
    stages('Build'){
        steps {
            echo 'Building..'
        }
    }
}