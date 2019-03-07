import React from 'react';
import { StyleSheet, Text, View } from 'react-native';

export default class App extends React.Component {
  render() {

    let pic = {
      uri: 'https://sm.ign.com/ign_latam/news/k/kirby-star/kirby-star-allies-nintendo-switch-release-date-announced_ubtt.jpg'
    };


    return (
      <View style={styles.container}>
        <Text>Open up App.js to start working on your app!</Text>
        <Image source {pic} style {{width: 200, height: 150}}/
      </View>

    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
