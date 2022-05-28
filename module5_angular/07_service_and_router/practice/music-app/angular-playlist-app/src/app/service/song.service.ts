import { Injectable } from '@angular/core';
import {Song} from "../model/song";

@Injectable({
  providedIn: 'root'
})
export class SongService {

  playlist: Song[] = [
    {
      id: 'CX11yw6YL1w',
      name: 'Céline Dion - Ashes (from the Deadpool 2 Motion Picture Soundtrack)'
    },
    {
      id: 'HBYirj2c_jw',
      name: 'Deadpool 2 - Take on Me'
    }
  ];

  findSongById(id: string){
    return this.playlist.find(item => item.id === id);
  }

  constructor() { }
}
