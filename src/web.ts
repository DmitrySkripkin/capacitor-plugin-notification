import { WebPlugin } from '@capacitor/core';
import { NotificationPlugin } from './definitions';

export class NotificationWeb extends WebPlugin implements NotificationPlugin {
  constructor() {
    super({
      name: 'Notification',
      platforms: ['web'],
    });
  }

  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}

const Notification = new NotificationWeb();

export { Notification };

import { registerWebPlugin } from '@capacitor/core';
registerWebPlugin(Notification);
