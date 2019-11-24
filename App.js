/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React, {Component} from 'react';
import {requireNativeComponent, Text, View, Button, Alert, StyleSheet, TouchableOpacity} from 'react-native';

const TMap = requireNativeComponent("TMap")
const BtnTmap = requireNativeComponent("BtnTmap")

export default class App extends Component {
  render() {
    return (
      <View style={{flex:1}}> 
      <TouchableOpacity onPress={this.geocoding} style={styles.buttonContainer} style={{flex:1}}>
          <Text style={styles.buttonText}>LOGIN</Text>
        </TouchableOpacity>


        <TMap
          style={{flex: 1}}
          addMarker={[{currentLat:37.57038581761725, currentLong:126.98287623279214, currentAddr:'Current', 
          upLat:37.566235882729345, upLong:126.98759692065485, upAddr:'Up',
          downLong:37.57099808351901, downLat:127.00193064562838, downAddr:'Down'}]}
        />
        {/* <BtnTmap style={{flex:1}} /> */}
        <Button
          title="T맵 연동하기"
          onPress={() => Alert.alert('T맵을 연동합니다.')}
        />
      </View>
    );
  }
}
const styles = StyleSheet.create({container: {flex: 1,backgroundColor: '#F5FCFF',},top: {flex: 1,alignItems: "center",justifyContent: "center",},bottom: {flex: 1,alignItems: "center",justifyContent: "center",},});